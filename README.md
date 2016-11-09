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

![Diagrama](https://mail.google.com/mail/u/0/?ui=2&ik=cf321da5e3&view=fimg&th=1584b517d595cc6c&attid=0.1&disp=inline&realattid=f_ivbj2mdr0&safe=1&attbid=ANGjdJ-ymsZzPnzndHP5k9_SOWxFSr5MmA_EB6FAlDiFGE0e6Kl-MXbV3mkHzBzZEL5mpC52VRH3y7s0yzF3cZWBHyeclJyL2U6poi-2AKEhAoDsXaZ9qnKYUU6KyW0&ats=1478732385617&rm=1584b517d595cc6c&zw&sz=w1366-h638)
