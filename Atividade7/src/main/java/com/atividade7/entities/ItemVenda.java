package com.atividade7.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "itemvenda")
public class ItemVenda {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id", nullable = false)
	private Long id;

	private int quantidade;
	
	private double valor_uni;
	
	@ManyToOne (fetch = FetchType. LAZY)
	@JoinColumn (name = "produto_id", nullable = false)
	private Produto produto;

	@ManyToOne (fetch = FetchType. LAZY)
	@JoinColumn (name = "venda_id", nullable = false)
	private Venda venda;

}