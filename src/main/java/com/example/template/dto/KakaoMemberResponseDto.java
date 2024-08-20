package com.example.template.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class KakaoMemberResponseDto {
    private String id;
    private String connected_at;
    private KakaoAccount kakao_account;

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class KakaoAccount {
        private Profile profile;

        @Getter
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Profile {
            private String nickname;
        }
    }
}
