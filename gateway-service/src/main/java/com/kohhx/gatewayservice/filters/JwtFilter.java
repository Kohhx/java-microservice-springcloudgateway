package com.kohhx.gatewayservice.filters;

import com.kohhx.gatewayservice.services.JwtService;
import org.springframework.stereotype.Component;

@Component
public class JwtFilter {
    private final JwtService jwtService;

    public JwtFilter(JwtService jwtService) {
        this.jwtService = jwtService;
    }


//    @Override
//    public Object run() throws ZuulException {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        LOGGER.info("Request to {} from {}", ctx.getRequest().getRequestURI(), ctx.getRequest().getRemoteAddr());
//        if (checkIfURIisSecured(ctx.getRequest().getRequestURI())) {
//            LOGGER.info("Request to {} from {}", ctx.getRequest().getRequestURI(), ctx.getRequest().getRemoteAddr());
//            String authorizationHeader = ctx.getRequest().getHeader("Authorization");
//            if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
//                throw new ZuulException("Missing Authorization Header", 401, "Authorization header is missing");
//            }
//            String token = authorizationHeader.substring(7);
//            try {
//                jwtService.validateToken(token);
//            } catch (Exception e) {
//                throw new ZuulException("Invalid Token", 401, "Invalid Token");
//            }
//        }
//        return null;
//    }
//
//    private boolean checkIfURIisSecured(String requestURI) {
//        List<String> notSecuredURI = List.of("/auth/token", "/auth/register", "/auth/validate");
//        if (notSecuredURI.contains(requestURI)) {
//            return false;
//        }
//        return true;
//    }
}
