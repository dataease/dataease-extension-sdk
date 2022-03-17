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

    // 权限查询方向 source:查询对应target 拥有的 source授权；target: 查询对应source 拥有的 target授权
    private String direction;
}
