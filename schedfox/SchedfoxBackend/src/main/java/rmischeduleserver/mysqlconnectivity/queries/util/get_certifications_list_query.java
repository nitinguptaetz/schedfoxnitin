/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rmischeduleserver.mysqlconnectivity.queries.util;

import rmischeduleserver.mysqlconnectivity.queries.GeneralQueryFormat;

/**
 *
 * @author user
 */
public class get_certifications_list_query extends GeneralQueryFormat {

    @Override
    public boolean hasAccess() {
        return true;
    }

    @Override
    public boolean hasPreparedStatement() {
        return true;
    }

    @Override
    public String getPreparedStatementString() {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM certifications");
        return sql.toString();
    }

}
