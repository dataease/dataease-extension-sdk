package io.dataease.plugins.xpack.email.dto.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class XpackEmailTemplateDTO implements Serializable{

    private Long id;

    private String title;

    private String panelId;

    private String recipients;

    private String pixel;

    private Long taskId;

    private byte[] content;

    private String viewIds;
    
}
