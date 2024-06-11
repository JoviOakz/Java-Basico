import java.math.BigDecimal;
import java.sql.Date;

class ComVenda {
    int n_numevenda;
    BigDecimal n_totavenda;
    int n_numevende;
    BigDecimal n_vcomvenda;
    Date d_datavenda;

    public ComVenda(int n_numevenda, BigDecimal n_totavenda, int n_numevende, Date d_datavenda) {
        this.n_numevenda = n_numevenda;
        this.n_totavenda = n_totavenda;
        this.n_numevende = n_numevende;
        this.d_datavenda = d_datavenda;
        this.n_vcomvenda = BigDecimal.ZERO;
    }
}