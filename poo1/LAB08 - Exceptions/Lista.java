public class Lista {

    private No primeiro;
    private No ultimo;
    private int tam = 0;

    public Lista() {
        this.primeiro = null;
        this.ultimo = primeiro;
    }

    public int getprimeiro() {
        No primeiro = this.primeiro.getnext();
        return primeiro.getnumero();
    }

    public int getultimo() {

        return this.ultimo.getnumero();
    }

    public void insert_sorted(int numero) {
        try {
            if (primeiro == null) {
                primeiro = new No();
                ultimo = primeiro;
                No N = new No();
                N.setnumero(numero);
                N.setnext(null);
                ultimo.setnext(N);
                ultimo = N;
                tam++;
            } else {
                No N = new No();
                N.setnumero(numero);
                N.setnext(null);
                ultimo.setnext(N);
                ultimo = N;
                tam++;
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Voce nao possiu memoria suficiente para continuar");
        }
    }

    public void insert_pos(int pos, int num) {
        try {
            if (pos > this.tam) {
                System.out.println("A Lista possui " + this.tam + "Elementos");
                insert_sorted(num);
                System.out.println("O tamanho da lista agora e " + this.tam);
            }

            else if (pos == size()) {
                No novo = new No(num);
                if (pos == 1) {
                    novo.setnext(primeiro.getnext());
                    primeiro.setnext(novo);
                    this.tam++;
                } else {

                    ultimo = novo;
                    this.tam++;
                }
            } else if (pos == 1) {
                No novo = new No(num);
                novo.setnext(primeiro.getnext());
                primeiro.setnext(novo);
                this.tam++;
            }

            else if (pos > 1) {
                No percorre = primeiro.getnext();
                No Sentinela = primeiro;

                for (int i = 1; i < size(); i++)
                    if (i == pos) {
                        No novo = new No(num);
                        novo.setnext(Sentinela.getnext());
                        Sentinela.setnext(novo);
                        tam++;
                        break;
                    } else {
                        percorre = percorre.getnext();
                        Sentinela = Sentinela.getnext();
                    }
            }
        } catch (NullPointerException e) {
            System.out.println("Lista Vazia");

        } catch (OutOfMemoryError e) {
            System.out.println("Voce nao possiu memoria suficiente para continuar");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e); // printa a mensagem padrao do erro (do proprio java)
        }
    }

    public void print() {
        try {
            No per = primeiro.getnext();

            while (per != null) {
                System.out.println(per.getnumero());
                per = per.getnext();
            }
        }
        catch(NullPointerException e) {
            System.out.println(e);
        }
    }
    

    public void erase_num(int num) {
        No per = primeiro.getnext();
        No Sent = primeiro;
        try {
            while (per != null) {
                if (per.getnumero() == num) {
                    if (per.getnext() == null) {
                        ultimo = Sent;
                        ultimo.setnext(null);
                        per = null;
                        tam--;
                        break;
                    } else {
                        Sent.setnext(per.getnext());
                        per.setnext(null);
                        per = null;
                        tam--;
                        break;
                    }
                }
                per = per.getnext();
                Sent = Sent.getnext();

            }
        } catch(NullPointerException e) {
            System.out.println(e);
        }
        System.gc();
        
    }

    public void erase_pos(int pos) {
        No per = primeiro.getnext();
        No Sent = primeiro;
        try {
            for (int i = 1; i < this.tam; i++) {
                if (i == pos) {
                    Sent.setnext(per.getnext());
                    per.setnext(null);
                    per = null;
                    break;
                }
                per = per.getnext();
                Sent = Sent.getnext();

            }
        }
        catch(NullPointerException e) {
            System.out.println(e);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.gc();
    }

    public int size() {
        return tam;
    }

    public void erase_data() {
        No percorre = primeiro.getnext();
        No Sentinela = primeiro;
        try {
            while (percorre != null) {
                Sentinela.setnext(null);
                Sentinela = null;
                Sentinela = percorre;
                percorre = percorre.getnext();
            }
        this.primeiro = null;
        this.ultimo = primeiro;
        }
        catch(NullPointerException e) {
            System.out.println(e);
        }
        System.gc();
    }

    public void push_front(int num) {
        No per = primeiro.getnext();
        No Sent = primeiro;
        try {
            while (per != null) {
                if (per.getnumero() == num) {
                    if (per.getnext() == null) {
                        ultimo = Sent;
                        ultimo.setnext(null);
                        per.setnext(primeiro.getnext());
                        primeiro.setnext(per);
                        break;
                    } else {
                        ultimo = Sent;
                        ultimo.setnext(per.getnext());
                        per.setnext(primeiro.getnext());
                        primeiro.setnext(per);
                        break;
                    }
                }
                per = per.getnext();
                Sent = Sent.getnext();
            } }
            catch(NullPointerException e) {
                System.out.println(e);
            }
    }

    public void push_back(int num) {
        No per = primeiro.getnext();
        No Sent = primeiro;
        try {
     if (this.tam == 1) {
            if (primeiro.getnumero() == num) {
                System.out.println("O elemento eh o unico na lista. ");
            } else
                System.out.println("A Lista não possui esse elemento ");
        }

        else
            while (per != null) {
                if (per.getnumero() == num) {
                    if (per.getnext() == null) {
                        System.out.println("Nenhuma alteracao foi feita, o elemente e o ultimo da lista. ");
                        break;
                    } else {
                        primeiro.setnext(per.getnext());
                        ultimo.setnext(per);
                        per.setnext(null);
                        ultimo = per;
                        break;
                    }
                }
                per = per.getnext();
                Sent = Sent.getnext();
            } }
            catch(NullPointerException e) {
                System.out.println(e);
            }
    }

    public void pop_front() {
       try {
         {
            No percorre = primeiro.getnext();
            if (percorre.getnext() == null) {
                this.primeiro.setnext(null);
                this.ultimo = primeiro;
                this.tam--;
            } else {
                primeiro.setnext(percorre.getnext());
                percorre.setnext(null);
                percorre = null;
                this.tam--;
            }
        } 
    }
    catch (NullPointerException e) {
        System.out.println(e);
    }
    }

    public void pop_back() {
        try { {
            No percorre = primeiro.getnext();
            if (percorre.getnext() == null) {
                this.primeiro.setnext(null);
                this.ultimo = primeiro;
                this.tam--;
            } else {
                No sentinela = primeiro;
                int temp = this.tam;
                while (temp != 0) {
                    temp--;
                    if (temp == 0) {
                        sentinela.setnext(null);
                        ultimo = sentinela;
                        percorre = null;
                        this.tam--;
                        break;
                    }
                    percorre = percorre.getnext();
                    sentinela = sentinela.getnext();

                }

            }
        } }
        catch(NullPointerException e) {
            System.out.println(e);
        }
    }

    public int find_pos(int num){
        try {    
        No percorre = primeiro.getnext();
            for (int i = 0; i < size(); i++) {
                if (percorre.getnumero() == num)
                    return i + 1;
                percorre = percorre.getnext();
            }}
            catch(NullPointerException e) {
                System.out.println(e);
            } 
            throw new IllegalArgumentException();
        }
    public int find_num(int pos) {
        try {

         {
            No percorre = primeiro.getnext();
            for (int i = 1; i < size(); i++) {
                if (i == pos)
                    return percorre.getnumero();
                percorre = percorre.getnext();
            }
        }
        System.out.println("Valor não encontrado");
        return -1;
    } catch(NullPointerException e) {
        System.out.println(e);
    }
    throw new IllegalArgumentException();
}
}
