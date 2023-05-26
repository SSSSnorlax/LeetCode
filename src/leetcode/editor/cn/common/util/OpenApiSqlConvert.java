package leetcode.editor.cn.common.util;

/**
 * @Author: Snorlax
 * @Date: 2021/11/25 23:08
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class OpenApiSqlConvert {
    public String strToSql(String str) {

        return null;
    }

    public static void main(String[] args) {
        System.out.println("<script>"
                + "select b.`auid`,b.`application_name` applicationName,COUNT(*) AS appCallNum from (\r\n" +
                "select app.`auid`,app.`application_name` from `application` app \r\n" +
                "left join `api_event_log` alog ON app.`prod_app_key`=alog.`app_key`\r\n" +
                "			<where> alog.envent_id is not null and alog.envir_flag='1' \r\n" +
                "	        	<if test=\"app.auid!=null and app.auid!=''\">and app.`auid` LIKE CONCAT('%',#{app.auid},'%')</if>\r\n" +
                "	        	<if test=\"app.applicationName!=null and app.applicationName!=''\">AND app.`application_name` LIKE CONCAT('%',#{app.applicationName},'%')</if>\r\n" +
                "        	</where>\r\n" +
                "			GROUP BY alog.envent_id\r\n" +
                ")b\r\n" +
                "GROUP BY b.`auid`,b.`application_name`\r\n" +
                "order by appCallNum desc\r\n" +
                "		LIMIT #{app.index},#{app.size}"
                + "</script>");
        String s = "<script>select b.`auid`,b.`application_name` applicationName,COUNT(*) AS appCallNum from (\n" +
                "select app.`auid`,app.`application_name` from `application` app \n" +
                "left join `api_event_log` alog ON app.`prod_app_key`=alog.`app_key`\n" +
                "\t\t\t<where> alog.envent_id is not null and alog.envir_flag='1' \n" +
                "\t        \t<if test=\"app.auid!=null and app.auid!=''\">and app.`auid` LIKE CONCAT('%',#{app.auid},'%')</if>\n" +
                "\t        \t<if test=\"app.applicationName!=null and app.applicationName!=''\">AND app.`application_name` LIKE CONCAT('%',#{app.applicationName},'%')</if>\n" +
                "        \t</where>\n" +
                "\t\t\tGROUP BY alog.envent_id\n" +
                ")b\n" +
                "GROUP BY b.`auid`,b.`application_name`\n" +
                "order by appCallNum desc\n" +
                "\t\tLIMIT #{app.index},#{app.size}</script>";


    }
}
