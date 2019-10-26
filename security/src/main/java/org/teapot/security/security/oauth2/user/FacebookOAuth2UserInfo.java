package org.teapot.security.security.oauth2.user;

import lombok.Getter;

import java.util.Map;

@Getter
public class FacebookOAuth2UserInfo implements OAuth2UserInfo {
    private String id;
    private String name;
    private String email;
    private String imageUrl;

    public FacebookOAuth2UserInfo(Map<String, Object> attributes) {
        this.id = (String) attributes.get("id");
        this.name = (String) attributes.get("name");
        this.email = (String) attributes.get("email");
        if (attributes.containsKey("picture")) {
            Map<String, Object> pictureObj = (Map<String, Object>) attributes.get("picture");
            if (pictureObj.containsKey("data")) {
                Map<String, Object> dataObj = (Map<String, Object>) pictureObj.get("data");
                if (dataObj.containsKey("url")) {
                    this.imageUrl = (String) dataObj.get("url");
                }
            }
        }
    }
}
