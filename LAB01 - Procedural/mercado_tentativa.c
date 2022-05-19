#include <stdio.h>
#include <stdlib.h>
#include <string.h>


struct produto{
	char codigo[20];
	char nome[50];
	char fabricante[10];
	float preco;
    int qtd;
	float cad;

};

struct cliente{
	char nome[50];
	char cpf[20];
	char datanascimento[10];
	float cep;
    int compras;
	float cadd;

};

struct funcionario{
	char nome[50];
	char cpf[20];
	char datanascimento[10];
	float dataingresso;
    int vendas;
	float caddd;

};



// Funcao Cadastro Produto
void cadastroprod(struct produto us[]){
    int p;
    p = us[1].cad;
    printf("Produto %d\n",p+1);
    printf("Digite o codigo do produto: ");
    fflush(stdin);
    scanf("%[^\n]s",us[p+1].codigo);
    printf("Digite o nome do produto: ");
    scanf("%s",us[p+1].nome);
    printf("Digite o fabricante: ");
    scanf("%s",us[p+1].fabricante);
    printf("Digite o preco: ");
    scanf("%s",us[p+1].preco);
    us[p+1].qtd=0;
    p++;
    us[1].cad = p;

}

// Funcao Cadastro Cliente
void cadastroclient(struct cliente us[]){
    int p;
    p = us[1].cadd;
    printf("Cliente %d\n",p+1);
    printf("Digite seu nome: ");
    fflush(stdin);
    scanf("%[^\n]s",us[p+1].nome);
    printf("Digite seu cpf: ");
    scanf("%s",us[p+1].cpf);
    printf("Digite sua data de nascimento: ");
    scanf("%s",us[p+1].datanascimento);
    printf("Digite seu cep: ");
    scanf("%s",us[p+1].cep);
    us[p+1].compras=0;
    p++;
    us[1].cadd = p;

}



// Funcao Cadastro Funcionario
void cadastrofunc(struct funcionario us[]){
    int p;
    p = us[1].caddd;
    printf("Cliente %d\n",p+1);
    printf("Digite seu nome: ");
    fflush(stdin);
    scanf("%[^\n]s",us[p+1].nome);
    printf("Digite seu cpf: ");
    scanf("%s",us[p+1].cpf);
    printf("Digite sua data de nascimento: ");
    scanf("%s",us[p+1].datanascimento);
    printf("Digite sua data de ingresso: ");
    scanf("%s",us[p+1].dataingresso);
    us[p+1].vendas=0;
    p++;
    us[1].caddd = p;

}

// Funcaoo ver perfil de um funcionario
void perfilfunc(struct funcionario us[]){
	int i;
	printf("Escolha o funcinario que deseja ver o perfil: ");
    scanf("%d",&i);
	printf("Nome: %s\n",us[i].nome);
	printf("CPF: %s\n",us[i].cpf);
	printf("Data de Nascimento: %s\n",us[i].datanascimento);
	printf("Data de Ingresso: %s\n",us[i].dataingresso);
	printf("*******************************\n\n");

}

/*
// Funcao venda
void venda(struct cliente us[]){
    char nome[50],cpf[20];
    int tent=4;
    int i;
    float dep;
    while(tent--){
    printf("Escolha o cliente que deseja comprar: ");
    scanf("%d",&i);
    printf("Digite seu nome: ");
    scanf("%s",nome);
    printf("Digite seu cpf: ");
	scanf("%s",cpf);
	int a = strcmp(nome,us[i].nome);
	int b = strcmp(cpf,us[i].cpf);
	if(a==0 && b==0){
        printf("Digite o valor da compra: ");
        printf("\n");
        scanf("%f",&dep);

        printf("Operacao realizada com sucesso!\n");
        printf("*******************************\n\n");
        break;
	}
    }

}
*/
// Menu
void menu(){
	int opcao;
	struct cliente P[30];
	float sald;

	while(1){
		printf("\nBem vindo ao Supermercado Zica");
		printf("\n1- Cadastrar Produtos");
		printf("\n2- Cadastrar Cliente");
		printf("\n3- Cadastrar Funcionario");
        printf("\n4- Realizar venda");
        printf("\n5- Ver perfil de um funcionario");
		printf("\n9- Sair");
		printf("\nDigite opcao: ");
		scanf("%d", &opcao);
		printf("\n");

		if(opcao == 1) cadastroprod(P);
		if(opcao == 2) cadastroclient(P);
		if(opcao == 3) cadastrofunc(P);
    //    if(opcao == 4) venda(P);
        if(opcao == 5) perfilfunc(P);
		if(opcao == 9) return;
	}
}

int main(){
	menu();
}
