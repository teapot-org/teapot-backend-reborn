package org.teapot.security.security.oauth2.user;

import lombok.Getter;

import java.util.Map;

@Getter
public class GoogleOAuth2UserInfo implements OAuth2UserInfo {
    private String id;
    private String name;
    private String email;
    private String imageUrl;

    public GoogleOAuth2UserInfo(Map<String, Object> attributes) {
        this.id = (String) attributes.get("sub");
        this.name = (String) attributes.get("name");
        this.email = (String) attributes.get("email");
        this.imageUrl = (String) attributes.get("picture");
    }
}
