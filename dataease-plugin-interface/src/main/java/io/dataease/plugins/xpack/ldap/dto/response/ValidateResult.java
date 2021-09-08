package io.dataease.plugins.xpack.ldap.dto.response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ValidateResult implements Serializable {

    private boolean success;

    private String userName;

    private String msg;

}
