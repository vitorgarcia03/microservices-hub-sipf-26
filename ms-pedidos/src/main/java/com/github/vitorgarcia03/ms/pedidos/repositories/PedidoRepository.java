package com.github.vitorgarcia03.ms.pedidos.repositories;

import com.github.vitorgarcia03.ms.pedidos.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
