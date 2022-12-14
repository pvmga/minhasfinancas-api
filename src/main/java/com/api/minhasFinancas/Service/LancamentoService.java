package com.api.minhasFinancas.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.api.minhasFinancas.Modelo.Entity.Lancamento;
import com.api.minhasFinancas.Modelo.Enums.StatusLancamentoEnums;

public interface LancamentoService {

    Lancamento salvar(Lancamento lancamento);
    Lancamento atualizar(Lancamento lancamento);
    void deletar(Lancamento lancamento);
    List<Lancamento> buscar(Lancamento lancamentoFiltro);
    void validar(Lancamento lancamento);

    void atualizarStatus(Lancamento lancamento, StatusLancamentoEnums status);

    Optional<Lancamento> obterPorId(Long id);

    BigDecimal obterSaldoPorUsuario(Long id);
}
