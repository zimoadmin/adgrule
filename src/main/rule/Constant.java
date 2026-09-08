package org.fordes.adg.rule;

import java.io.File;

public class Constant {

    public static final String ROOT_PATH = System.getProperty("user.dir");

    public static final String TITLE =
            "# Title: AdGuard、AdGuardHome广告过滤规则合并/去重 - {}\r\n";

    public static final String UPDATE = "# Update time: {}\r\n";

    public static final String EXPIRES = "# Expires: 1 hour\r\n";

    public static final String REPO_URL =
            "# Repo URL: https://github.com/zimoadmin/adgrule\r\n# Upstream: https://github.com/hululu1068/AdGuard-Rule\r\n# 免责声明，维护不易，有问题联系，Q2114408211\r\n\r\n";

    public static final String OUTPUT_HEADER =
            "###################################   合并/去重自以下规则   ####################################\r\n";

    public static final String OUTPUT_FOOTER =
            "###############################################################################################\r\n" +
            "\r\n" +
            "# 每小时同步一次、如有误杀、请手动解除\r\n" +
            "\r\n";

    public static final String LOCAL_RULE_SUFFIX = ROOT_PATH + File.separator + "rule";

}
