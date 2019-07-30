package cn.ymsys.api.common.request;

import lombok.Data;

@Data
public class TalkRequest {
    private String userId;
    private Integer talkType;
    private String talkId;
    private Integer id;
}
