package io.dataease.plugins.xpack.auth.dto.request;

import io.dataease.plugins.xpack.auth.dto.response.XpackSysAuth;
import io.dataease.plugins.xpack.auth.dto.response.XpackSysAuthDetail;
import lombok.Data;

import java.util.List;

@Data
public class XpackSysAuthRequest extends XpackSysAuth {

    private List<String> authSources;

    private List<String> authTargets;

    private XpackSysAuthDetail authDetail;
}
