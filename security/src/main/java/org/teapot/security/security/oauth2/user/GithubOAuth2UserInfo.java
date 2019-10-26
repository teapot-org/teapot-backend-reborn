package org.teapot.security.security.oauth2.user;

import lombok.Getter;

import java.util.Map;

@Getter
public class GithubOAuth2UserInfo implements OAuth2UserInfo {
    private String id;
    private String name;
    private String email;
    private String imageUrl;

    public GithubOAuth2UserInfo(Map<String, Object> attributes) {
        this.id = ((Integer) attributes.get("id")).toString();
        this.name = (String) attributes.get("name");
        this.email = (String) attributes.get("email");
        this.imageUrl = (String) attributes.get("avatar_url");
    }
}
