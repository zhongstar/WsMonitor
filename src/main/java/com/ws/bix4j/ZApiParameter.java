package com.ws.bix4j;

/**
 * @Date 2017/4/4
 * @Author chen
 */
public class ZApiParameter {
    public static final int ZABBIX_CLIENT_DEFAULT_PORT = 10050;

    public static final int ITEM_DELAY_DEFAULT = 60;

    private ZApiParameter() {
    }

    public static enum HOST_INTERFACE_TYPE {
        AGENT(1), SNMP(2), IPMI(3), JMX(4);


        public int value = 1;

        private HOST_INTERFACE_TYPE(int value) {
            this.value = value;
        }

    }

    public static enum HOST_AGENT_ACCESS_INTERFACE {
        HOST_DNS(0), IP_ADDRESS(1);

        public int value = 0;

        private HOST_AGENT_ACCESS_INTERFACE(int value) {
            this.value = value;
        }
    }

    /**
     * IPMI验证算法
     */
    public static enum IPMI_AUTH_TYPE {
        DEFAULT(-1), NONE(0), MD2(1), MD5(2), STRAIGHT(3), OEM(4), RMCP_PLUS(5);

        public int value = -1;

        private IPMI_AUTH_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum IPMI_PRIVILEAGE {
        CALLBACK(1), USER(2), OPERATOR(3), ADMIN(4), OEM(5);

        public int value;

        private IPMI_PRIVILEAGE(int value) {
            this.value = value;
        }
    }

    public static enum HOST_MONITOR_STATUS {
        MONITORED_HOST(0), UNMONITORED_HOST(1);

        public int value;

        private HOST_MONITOR_STATUS(int value) {
            this.value = value;
        }

    }

    public static enum ITEM_VALUE_TYPE {
        NUMERIC_FLOAT(0), CHARACTOR(1), LOG(2), NUMERIC_UNSIGNED(3), TEXT(4);

        public int value;

        private ITEM_VALUE_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum DEBUG_MODE {
        DISABLE("0"), ENABLE("1");

        public String value;

        private DEBUG_MODE(String value) {
            this.value = value;
        }
    }

    public static enum USER_STATUS {
        DISABLE("1"), ENABLE("0");

        public String value;

        private USER_STATUS(String value) {
            this.value = value;
        }
    }

    public static enum GUI_ACCESS {
        SYS_DEFAULT_AUTH("0"), INTERNAL_AUTH("1"), DISABLE_ACCESS_FRONTEND("2");

        public String value;

        private GUI_ACCESS(String value) {
            this.value = value;
        }
    }

    public static enum ACCESS_LEVEL {
        ACCESS_DENIED(0), READONLY(1), READ_WRITE(2);

        public int value;

        private ACCESS_LEVEL(int value) {
            this.value = value;
        }
    }

    public static enum QUERY {
        count, shorten, refer, extend;
    }
}
