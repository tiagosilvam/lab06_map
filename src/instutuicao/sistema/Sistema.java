package instutuicao.sistema;

import instutuicao.controller.ControladorFinanceiro;
import instutuicao.controller.ControladorRdm;

public class Sistema {
    ControladorRdm rdm;
    ControladorFinanceiro financeiro;

    public Sistema() {
        setRdm(new ControladorRdm());
        setFinanceiro(new ControladorFinanceiro(getRdm()));
    }

    public ControladorRdm getRdm() {
        return rdm;
    }

    public void setRdm(ControladorRdm rdm) {
        this.rdm = rdm;
    }

    public ControladorFinanceiro getFinanceiro() {
        return financeiro;
    }

    public void setFinanceiro(ControladorFinanceiro financeiro) {
        this.financeiro = financeiro;
    }
}
