package io.dataease.plugins.common.request.permission;

import io.dataease.plugins.common.base.domain.DatasetTableField;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DatasetRowPermissionsTreeItem implements Serializable {
    private String type;// 'item' or 'tree'
    // item
    private String fieldId;
    private DatasetTableField field;// field object
    private String filterType;// 'logic' or 'enum'
    private String term;//'eq','not_eq','lt','le','gt','ge','in','not in','like','not like','null','not_null','empty','not_empty','between'
    private String value;// 'a'
    private List<String> enumValue;// ['a','b']
    // tree
    private DatasetRowPermissionsTreeObj subTree;

    private static final long serialVersionUID = 1L;
}
