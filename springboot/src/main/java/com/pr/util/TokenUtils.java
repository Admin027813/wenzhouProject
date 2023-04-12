package com.pr.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TokenUtils {

//    @Autowired
//    private UserMapper userMapper;
//
//    private static UserMapper staticUserMapper;

//    @PostConstruct
//    public void init() {
//        staticUserMapper = userMapper;
//    }

    /**
     * 生成token
     * @param user
     * @return
     */
//    public static String genToken(LoginUser user) {
//        return JWT.create().withExpiresAt(DateUtil.offsetDay(new Date(), 1)).withAudience(user.getId())
//                .sign(Algorithm.HMAC256(user.getPassword()));
//    }

    /**
     * 获取token中的用户信息
     * @return
     */
//    public static User getUser() {
//        try {
//            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//            String token = request.getHeader("token");
//            String aud = JWT.decode(token).getAudience().get(0);
//            Integer userId = Integer.valueOf(aud);
//            return staticUserMapper.selectById(userId);
//        } catch (Exception e) {
//            log.error("解析token失败", e);
//            return null;
//        }
//    }
}
