# Padrão de Projeto Proxy

## Objetivos


O seu objetivo principal é encapsular um objeto através de um outro objeto que possui a mesma interface, de forma que o segundo objeto, conhecido como “Proxy”, controla o acesso ao primeiro, que é o objeto real.

## Tipos

Proxy Remoto - disponibiliza um representante local para um objeto que reside em um espaço de endereçamento diferente.

Virtual Proxy - cria objetos custosos sob demanda.

Proteção Proxy - Um proxy de proteção pode ser usado para controlar o acesso a um recurso com base em direitos de acesso.

## Vantagens


Permite deixar transparente o local (endereço) do objeto real (Remote Proxy).

O framework hibernate utiliza o Pattern Proxy, por exemplo, ao fazer o ‘lazy-loading’.

Útil para realizar otimizações, como cache de objetos (Virtual Proxy).

![Diagrama](https://scontent-gru2-1.xx.fbcdn.net/v/t34.0-12/15049890_661271847369753_544176351_n.png?oh=69abb6d7563f24dff8f3ea321de8d555&oe=5825D969)
