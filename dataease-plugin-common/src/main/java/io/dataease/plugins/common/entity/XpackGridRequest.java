package io.dataease.plugins.common.entity;

import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.List;

@Data
public class XpackGridRequest implements Serializable {

    private List<XpackConditionEntity> conditions;

    public XpackGridExample convertExample(){
        XpackGridExample gridExample = new XpackGridExample();
        if (CollectionUtils.isEmpty(conditions))return gridExample;

        XpackGridExample.Criteria criteria = gridExample.createCriteria();
        conditions.forEach(criteria::addCondtion);
        return gridExample;
    }
}
