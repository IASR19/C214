<?php

class Email
{
    private $email; // ATRIBUTO EMAIL

    /* Nota-se que como característica da linguagem PHP, para declaração de uma variável,
    necessitamos do símbolo "$" como primeiro elemento do nome da var*/

    private function __construct(string $email) // construtor recebe uma string com o email
        // informado e o atribui ao atributo da classe
    {
        $this->validarEmail($email);
        $this->email = $email;
    }

    // CRIANDO METODOS

    public static function retornarInstancia(string $email) : self // retorna instancia da classe e-mail
                                            //quando for chamado, é estático, não necessitaser new $email.
    {
        return new self($email);
    }

    public function __toString() : string // __toString() determina o que vai ser retornado quando a classe em si for chamada
                                            // nosso caso será o e-mail usado para criar a imstamcia da classe
    {
        return $this->email;
    }

    private function validarEmail(string $email) : void // colocado no construtor
    {
        if(!filter_var($email,FILTER_VALIDATE_EMAIL)){ //valida o formato do email, caso falso, dispara Exception
            throw new InvalidArgumentException(
                sprintf(
                    '"%s" não é um endereço de e-mail válido.',
                    $email
                )
            );
        }
    }




}