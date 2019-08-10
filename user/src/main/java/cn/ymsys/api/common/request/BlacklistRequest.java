package cn.ymsys.api.common.request;

import lombok.Data;

@Data
public class BlacklistRequest {
    private String groupId;
    private String userId;
}
