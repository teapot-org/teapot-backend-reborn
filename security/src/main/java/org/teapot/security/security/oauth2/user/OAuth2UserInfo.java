package org.teapot.security.security.oauth2.user;

public interface OAuth2UserInfo {
    String getId();

    String getName();

    String getEmail();

    String getImageUrl();
}
