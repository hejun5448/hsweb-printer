/*
 *  Copyright (c) 2015.  meicanyun.com Corporation Limited.
 *  All rights reserved.
 *
 *  This software is the confidential and proprietary information of
 *  meicanyun Company. ("Confidential Information").  You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with meicanyun.com.
 */

package org.hsweb.printer.fx.component.builders.elements.text;

import org.hsweb.printer.utils.printable.templateptint.TemplatePrintConstants;
import org.hsweb.printer.utils.printable.templateptint.dtos.VariableComponentDTO;

/**
 * Created by xiong on 2017-07-19.
 */
public class VariableElementComponentBuilder extends TextElementComponentBuilder {
    @Override
    public String getType() {
        return TemplatePrintConstants.VARIABLE;
    }
    @Override
    protected VariableComponentDTO getTemplateComponentDTO() {
        VariableComponentDTO textComponentDTO=new VariableComponentDTO();
        textComponentDTO.setContext("变量名");
        return textComponentDTO;
    }
}
