package com.xiaohaoo.toolkit.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

/**
 * @author xiaohao
 * @version 1.0
 * @since 2022/1/7 4:41 PM
 */

public class AccessTokenUtils {
    private static String SECRET = "XIAOHAOO";
    private static final Algorithm ALGORITHM = Algorithm.HMAC256(SECRET);

    public static void setSecret(String secret) {
        SECRET = secret;
    }

    public static String createToken(String claim) {
        return JWT.create().withAudience("xiaohao").withIssuedAt(new Date()).withClaim("claim", claim).sign(ALGORITHM);
    }

    public static String getClaimFromToken(String token) {
        JWTVerifier jwtVerifier = JWT.require(ALGORITHM).build();
        DecodedJWT decodedJwt = jwtVerifier.verify(token);
        return decodedJwt.getClaim("claim").asString();
    }
}
