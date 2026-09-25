package cl.duoc.pedidos360_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @GetMapping
    public List<Map<String, Object>> obtenerPedidos() {
        return Arrays.asList(
                Map.of("id", 1, "producto", "Laptop", "cantidad", 1, "total", 1200.50),
                Map.of("id", 2, "producto", "Monitor", "cantidad", 2, "total", 300.00),
                Map.of("id", 3, "producto", "Teclado", "cantidad", 1, "total", 45.99)
        );
    }
}
