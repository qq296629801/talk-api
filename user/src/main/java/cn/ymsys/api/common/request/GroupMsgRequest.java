package cn.ymsys.api.common.request;

import lombok.Data;

@Data
public class GroupMsgRequest {
    private String groupId;
    private String sendUid;
    private Integer msgType;
    private String message;
    private Integer gmId;
}
