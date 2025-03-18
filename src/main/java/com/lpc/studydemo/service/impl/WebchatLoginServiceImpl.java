//package com.lpc.studydemo.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// * @author 刘鹏程
// */
//public class WechatLoginServiceImpl {
//
//    @Autowired
//    private WechatConfigRepository wechatConfigRepository;
//
//    @Autowired
//    private ThirdPartyUserRepository thirdPartyUserRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private AuthService authService;
//
//    public ResponseEntity<?> wechatLogin(String code, String deviceType) {
//
//        // Step 1: 获取 accessToken 和 openId
//        WechatConfig config = wechatConfigRepository.findByDeviceType(deviceType);
//        WechatTokenResponse tokenResponse = wechatApi.getAccessToken(code, config.getAppId(), config.getAppSecret());
//        String accessToken = tokenResponse.getAccessToken();
//        String openId = tokenResponse.getOpenId();
//
//        // Step 2: 获取用户信息和 unionId
//        WechatUserInfo userInfo = wechatApi.getUserInfo(accessToken, openId);
//        String unionId = userInfo.getUnionId();
//
//        // Step 3: 查询第三方用户信息
//        ThirdPartyUser thirdPartyUser = thirdPartyUserRepository.findByUnionId(unionId);
//        if (thirdPartyUser == null) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("未授权");
//        }
//        if (thirdPartyUser.getUserId() == null) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("未绑定用户");
//        }
//
//        // Step 4: 更新三方信息表
//        thirdPartyUser.setNickname(userInfo.getNickname());
//        thirdPartyUser.setAvatar(userInfo.getAvatar());
//        thirdPartyUserRepository.save(thirdPartyUser);
//
//        // Step 5: 保存认证记录（如果是第一次认证）
//        if (!thirdPartyUser.isAuthenticated()) {
//            thirdPartyUser.setAuthenticated(true);
//            // 保存认证记录
//            thirdPartyUserRepository.save(thirdPartyUser);
//        }
//
//        // Step 6: 执行通用登录逻辑
//        User user = userRepository.findById(thirdPartyUser.getUserId()).orElseThrow();
//        String token = authService.generateToken(user);
//        // 返回token和用户信息
//        return ResponseEntity.ok(new LoginResponse(token, user));
//    }
//}
