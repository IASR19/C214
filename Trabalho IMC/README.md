O Projeto consiste em um app de cálculo de IMC

# Equipe
* Itamar Augusto Silva Ribeiro
* João Pedro Niz de Assis
* Leonardo Martin de Lucio

# Framework
> Projeto feito utilizando o flutter, framework utilizado na disciplina de C214-L, do monitor Samuel Kenzo.

# Instalação

Se você entende um pouco de inglês, e quer ler a documentação oficial de instalação do Flutter para <a href="https://docs.flutter.dev/get-started/install/windows">Windows</a>, <a href="https://docs.flutter.dev/get-started/install/macos">MacOS</a>, <a href="https://docs.flutter.dev/get-started/install/linux">Linux</a> e <a href="https://docs.flutter.dev/get-started/install/chromeos">ChromeOS</a>, basta <a href="https://docs.flutter.dev/get-started/install"/>clicar aqui</a>


#### Para obter o SDK Flutter <a href="https://storage.googleapis.com/flutter_infra_release/releases/stable/windows/flutter_windows_2.8.0-stable.zip">clique aqui</a>.

#### Para outros canais de lançamento e compilações mais antigas, consulte a página de <a href="https://docs.flutter.dev/development/tools/sdk/releases">lançamentos</a> do SDK .


### Android Studio

* Baixe e instale <a href="https://developer.android.com/studio">Android Studio</a>
* Inicie o Android Studio e siga o 'Android Studio Setup Wizard'. Isso instala o Android SDK, as ferramentas de linha de comando do Android SDK e as ferramentas de construção do Android SDK, que são exigidas pelo Flutter ao desenvolver para Android

### Flutter Doctor
Em um console que entendo o comando **flutter**, rode o comando
```bash
flutter doctor
```

Este comando verifica seu ambiente e exibe um relatório do status da instalação do Flutter. </br>

Se o Flutter não conseguir localizá-lo, execute o código abaixo para definir o diretório em que o Android Studio está instalado.
```bash
flutter config --android-studio-dir <directory>
```

*Observação:* Se **flutter doctor** retornar que o plug-in Flutter ou Dart do Android Studio não estão instalados, vá para <a href="https://docs.flutter.dev/get-started/editor?tab=androidstudio">configurar um editor</a> para resolver esse problema.

### Concordar com as licenças do Android
Antes de usar o Flutter, você deve concordar com as licenças da plataforma Android SDK. Esta etapa deve ser executada após os processos anteriores.
* Certifique-se de ter uma versão do Java 8 instalada e que sua variável de ambiente esteja configurada para a pasta do JDK. </br>

* Abra um console e execute o seguinte comando
```bash
flutter doctor --android-licenses
```

### Comandos de teste

O comando abaixo roda todos os arquivos teste do projeto que mantenham o padrão (test_ ou _test)

```bash
flutter test
```
Para rodar todos os arquivos teste contornando o problema de valor nulo: 

```bash
flutter test --no-sound-null-safety 
```

### Utilizando a aplicação 

A aplicação possui uma interface bem intuitiva, onde colocamos os valores de peso e altura e nos é entregue um feedback sobre a condição do indivíduo avaliado.

IMC MENOR QUE 18.5:
   RESULTADO: ABAIXO DO PESO
   FEEDBACK: "Seu cabo de vassoura!"

IMC ENTRE 18.5 E 24.9:
   RESULTADO: NORMAL
   FEEDBACK: "Normal..."

IMC ENTRE 25 E 29.9:
   RESULTADO: SOBREPESO
   FEEDBACK: "Tá gordinho hein?"

IMC ENTRE 30 E 39.9:
   RESULTADO: OBESIDADE I
   FEEDBACK: "Uma dietinha vai bem..."

IMC ENTRE IGUAL OU MAIOR QUE 40:
   RESULTADO: OBESIDADE II
   FEEDBACK: "Sem salvação..."


## Link Apresentação:
> https://www.youtube.com/watch?v=RBAd1nrzle8