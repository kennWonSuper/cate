package com.cloud.oauthcenter;

import lombok.Data;

import java.io.Serializable;

/**
 * Create by xiangli.ma on  2018-7-13 10:41
 *
 * @description:
 * @author: xiangli.ma
 */
@Data
public class UserDetail implements Serializable {

    private static final long serialVersionUID = 1101L;

    private Long id;

    /**用户名*/
    private String userName;

    /**用户管理平台ID*/
    private String rawUserId;

    /**登录用户管理平台TOKEN*/
    private String token;

    /**姓名*/
    private String realName;

    /**证件类型*/
    private String certiType;

    /**证件号码*/
    private String certiCode;

    /**用户类型:101内勤，102和105外勤:101内勤，102和105外勤*/
    private String userCate;

    /**原系统人员ID:外勤系统人员ID或内勤系统人员ID*/
    private Long staffId;

    /**专业公司ID*/
    private Long headId;

    /**机构代码*/
    private String orgCode;

    /**权限机构代码*/
    private String dataOrgCode;

    /**权限机构名称*/
    private String dataOrgName;

    /**权限机构名称*/
    private String dataOrgCodePath;

    /**组织代码/网点代码*/
    private Long deptId;

    /**机构代码*/
    private String deptCode;

    /**在职状态: 0 在职，1 不在职*/
    private String userStatus;

    /**密码需改*/
    private String pwdNeedChange;

    private String dataOrgLevel;

    /**机构路径*/
    private String divPath;

    /**组织路径*/
    private String deptPath;

    private String bizId;

    /**机构名称*/
    private String deptName;

    /**组织名称*/
    private String orgName;
}
