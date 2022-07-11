package io.dataease.plugins.common.base.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DatasetRowPermissionsTreeWithBLOBs extends DatasetRowPermissionsTree implements Serializable {
    private String expressionTree;

    private String whiteListUser;

    private String whiteListRole;

    private String whiteListDept;

    private static final long serialVersionUID = 1L;
}
