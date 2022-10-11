<?php

include ('Email.php');

class EmailTest extends PHPUnit\Framework\TestCase // TestCase utilizado para obtermos tudo necessário paratestar.
{
    /* Em PHPUnit, qualquer teste tem que começar com "Test", assim é identificado como método pertencente à
    suite de testes*/

    // CRIANDO TESTES PARA PASSAR

    public function testValidarTipoDaInstancia():void // compara o mesmo tipo objeto (por classe)
    {
        $this->assertInstanceOf(
            Email::class,
            Email::retornarInstancia('itamar_augusto@ges.inatel.br')
        );
    }

    public function testTestarRetornoDaInstancia():void // compara o mesmo tipo primitivo (por string)
    {
        $this->assertEquals(
            'itamar_augusto@ges.inatel.br',
            Email::retornarInstancia('itamar_augusto@ges.inatel.br')
        );
    }

    public function testRetornaExcecaoSeEmailForInvalido():void // esperamos que o teste dispare uma Exception ao passar
                                                               //um e-mail invalido para o metodo retornar em instancia.
    {
        $this->expectException(InvalidArgumentException::class);
        Email::retornarInstancia('email_invalido.com');
    }


    // CRIANDO TESTES PARA NÃO PASSAR

    public function testEmailInvalido():void
    {
        $this->expectException(InvalidArgumentException::class);
        Email::retornarInstancia('email@valido.com');
    }

}

