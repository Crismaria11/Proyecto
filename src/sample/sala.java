import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import sample.compra;

class Sala {
    public static void main(String[] args) {
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader bufRead = new BufferedReader(inStream);
        asiento A1 = new asiento(null, 0, null, null, null, null);

        asiento A2 = new asiento(null, 0, null, null, null, null);

        asiento A3 = new asiento(null, 0, null, null, null, null);

        asiento A4 = new asiento(null, 0, null, null, null, null);

        asiento A5 = new asiento(null, 0, null, null, null, null);


        asiento B1 = new asiento(null, 0, null, null, null, null);

        asiento B2 = new asiento(null, 0, null, null, null, null);

        asiento B3 = new asiento(null, 0, null, null, null, null);

        asiento B4 = new asiento(null, 0, null, null, null, null);

        asiento B5 = new asiento(null, 0, null, null, null, null);


        asiento C1 = new asiento(null, 0, null, null, null, null);

        asiento C2 = new asiento(null, 0, null, null, null, null);

        asiento C3 = new asiento(null, 0, null, null, null, null);

        asiento C4 = new asiento(null, 0, null, null, null, null);

        asiento C5 = new asiento(null, 0, null, null, null, null);


        asiento D1 = new asiento(null, 0, null, null, null, null);

        asiento D2 = new asiento(null, 0, null, null, null, null);

        asiento D3 = new asiento(null, 0, null, null, null, null);

        asiento D4 = new asiento(null, 0, null, null, null, null);

        asiento D5 = new asiento(null, 0, null, null, null, null);


        asiento E1 = new asiento(null, 0, null, null, null, null);

        asiento E2 = new asiento(null, 0, null, null, null, null);

        asiento E3 = new asiento(null, 0, null, null, null, null);

        asiento E4 = new asiento(null, 0, null, null, null, null);

        asiento E5 = new asiento(null, 0, null, null, null, null);


        asiento F1 = new asiento(null, 0, null, null, null, null);

        asiento F2 = new asiento(null, 0, null, null, null, null);

        asiento F3 = new asiento(null, 0, null, null, null, null);

        asiento F4 = new asiento(null, 0, null, null, null, null);

        asiento F5 = new asiento(null, 0, null, null, null, null);


        asiento G1 = new asiento(null, 0, null, null, null, null);

        asiento G2 = new asiento(null, 0, null, null, null, null);

        asiento G3 = new asiento(null, 0, null, null, null, null);

        asiento G4 = new asiento(null, 0, null, null, null, null);

        asiento G5 = new asiento(null, 0, null, null, null, null);


        asiento H1 = new asiento(null, 0, null, null, null, null);

        asiento H2 = new asiento(null, 0, null, null, null, null);

        asiento H3 = new asiento(null, 0, null, null, null, null);

        asiento H4 = new asiento(null, 0, null, null, null, null);

        asiento H5 = new asiento(null, 0, null, null, null, null);

        System.out.println("Se regresara al menu principal.\n Si desea continuar presione 1 y si desea salir presione 2");


        try {
            String stopString = bufRead.readLine();
            int stop = Integer.parseInt(stopString);
            if(stop == 2) {
                System.out.println("Se saldra del programa ahora");
                System.exit(0);

            }


            do{
                new compra();
                String choiceString = bufRead.readLine();
                int choiceInt = Integer.parseInt(choiceString);
                if(choiceInt == 1){
                    makeSeatReserveTicket(A1, A2, A3, A4, A5,
                            B1, B2, B3, B4, B5,
                            C1, C2, C3, C4, C5,
                            D1, D2, D3, D4, D5,
                            E1, E2, E3, E4, E5,
                            F1, F2, F3, F4, F5,
                            G1, G2, G3, G4, G5,
                            H1, H2, H3, H4, H5);
                    }



                if(choiceInt==2){
                    try{
                        Cancel(A1, A2, A3, A4, A5,
                                B1, B2, B3, B4, B5,
                                C1, C2, C3, C4, C5,
                                D1, D2, D3, D4, D5,
                                E1, E2, E3, E4, E5,
                                F1, F2, F3, F4, F5,
                                G1, G2, G3, G4, G5,
                                H1, H2, H3, H4, H5);
                    }  catch(Exception e){
                        e.printStackTrace();
                    }
                }



                if(choiceInt==3){
                    printSeating(A1, A2, A3, A4, A5,
                            B1, B2, B3, B4, B5,
                            C1, C2, C3, C4, C5,
                            D1, D2, D3, D4, D5,
                            E1, E2, E3, E4, E5,
                            F1, F2, F3, F4, F5,
                            G1, G2, G3, G4, G5,
                            H1, H2, H3, H4, H5);
                }
                else{
                    System.out.println("Este numero no es valido");
                }
            } while(stop!=2);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
    public static void compra() {
        System.out.println("Menu\n");
        System.out.println("Ingrese una opcion");
        System.out.println("1. Comprar ticket");
        System.out.println("2. Cancelar un ticket");
        System.out.println("3. Ver asientos");
        System.out.println("4. Salir");
    }


    //Primero se va a hacer la compra/reservacion del ticket

    private static void makeSeatReserveTicket(asiento A1, asiento A2, asiento A3, asiento A4, asiento A5,
                                              asiento B1, asiento B2, asiento B3, asiento B4, asiento B5,
                                              asiento C1, asiento C2, asiento C3, asiento C4, asiento C5,
                                              asiento D1, asiento D2, asiento D3, asiento D4, asiento D5,
                                              asiento E1, asiento E2, asiento E3, asiento E4, asiento E5,
                                              asiento F1, asiento F2, asiento F3, asiento F4, asiento F5,
                                              asiento G1, asiento G2, asiento G3, asiento G4, asiento G5,
                                              asiento H1, asiento H2, asiento H3, asiento H4, asiento H5) {

        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader bufRead = new BufferedReader(inStream);
        System.out.println("Por favor seleccione el asiento que desee");

        try{
            String enterType0 = bufRead.readLine();
            int asientoInput = Integer.parseInt(enterType0);
            if(asientoInput == 1) {
                String input;
                int full = 0;

                while (full == 0) {
                    System.out.println("Por favor escriba el numero de asiento que desee.");
                    input = bufRead.readLine();

                    // A1 - A5
                    if(input.equals("A1")) {
                        if(A1.firstName == null) {
                            System.out.println("Escriba el nombre, apellido, correo y contrasena");
                            System.out.println("Primer Nombre: ");
                            A1.firstName = bufRead.readLine();
                            System.out.println("Primer apellido");
                            A1.lastName = bufRead.readLine();
                            System.out.println("Escribe tu correo");
                            A1.correo = bufRead.readLine();
                            System.out.println("Escribe tu contrasena");
                            A1.contrasena = bufRead.readLine();

                            System.out.println("Desea otro ticket. Escriba 1 para comprar otro.");
                            String enterType1 = bufRead.readLine();
                            int continueReserveTicket = Integer.parseInt(enterType1);

                            if(continueReserveTicket == 1) {
                                System.out.println("Seleccione el segundo ticket que desea");
                            }
                            else {
                                System.out.println("Gracias por su compra");
                                full++;
                            }
                        }

                        else {
                            System.out.println("Este asiento ya fue tomado");
                        }
                    }

                    else if(input.equals("A2")) {
                        if(A2.firstname == null) {
                            System.out.println("Escriba el nombre, apellido, correo y contrasena");
                            System.out.println("Primer Nombre: ");
                            A2.firstName = bufRead.readLine();
                            System.out.println("Primer apellido");
                            A2.lastName = bufRead.readLine();
                            System.out.println("Escribe tu correo");
                            A2.correo = bufRead.readLine();
                            System.out.println("Escribe tu contrasena");
                            A2.contrasena = bufRead.readLine();

                            System.out.println("Desea otro ticket. Escriba 1 para comprar otro.");
                            String enterType1 = bufRead.readLine();
                            int continueReserveTicket = Integer.parseInt(enterType1);

                            if(continueReserveTicket == 1) {
                                System.out.println("Seleccione el segundo ticket que desea");
                            }
                            else {
                                System.out.println("Gracias por su compra");
                                full++;
                            }
                        }

                        else {
                            System.out.println("Este asiento ya fue tomado");
                        }
                    }

                    else if(input.equals("A3")) {
                        if(A3.firstname == null) {
                            System.out.println("Escriba el nombre, apellido, correo y contrasena");
                            System.out.println("Primer Nombre: ");
                            A3.firstName = bufRead.readLine();
                            System.out.println("Primer apellido");
                            A3.lastName = bufRead.readLine();
                            System.out.println("Escribe tu correo");
                            A3.correo = bufRead.readLine();
                            System.out.println("Escribe tu contrasena");
                            A3.contrasena = bufRead.readLine();

                            System.out.println("Desea otro ticket. Escriba 1 para comprar otro.");
                            String enterType1 = bufRead.readLine();
                            int continueReserveTicket = Integer.parseInt(enterType1);

                            if(continueReserveTicket == 1) {
                                System.out.println("Seleccione el segundo ticket que desea");
                            }
                            else {
                                System.out.println("Gracias por su compra");
                                full++;
                            }
                        }

                        else {
                            System.out.println("Este asiento ya fue tomado");
                        }
                    }

                    else if(input.equals("A4")) {
                        if(A4.firstname == null) {
                            System.out.println("Escriba el nombre, apellido, correo y contrasena");
                            System.out.println("Primer Nombre: ");
                            A4.firstName = bufRead.readLine();
                            System.out.println("Primer apellido");
                            A4.lastName = bufRead.readLine();
                            System.out.println("Escribe tu correo");
                            A4.correo = bufRead.readLine();
                            System.out.println("Escribe tu contrasena");
                            A4.contrasena = bufRead.readLine();

                            System.out.println("Desea otro ticket. Escriba 1 para comprar otro.");
                            String enterType1 = bufRead.readLine();
                            int continueReserveTicket = Integer.parseInt(enterType1);

                            if(continueReserveTicket == 1) {
                                System.out.println("Seleccione el segundo ticket que desea");
                            }
                            else {
                                System.out.println("Gracias por su compra");
                                full++;
                            }
                        }

                        else {
                            System.out.println("Este asiento ya fue tomado");
                        }
                    }

                    else if(input.equals("A5")) {
                        if(A5.firstname == null) {
                            System.out.println("Escriba el nombre, apellido, correo y contrasena");
                            System.out.println("Primer Nombre: ");
                            A5.firstName = bufRead.readLine();
                            System.out.println("Primer apellido");
                            A5.lastName = bufRead.readLine();
                            System.out.println("Escribe tu correo");
                            A5.correo = bufRead.readLine();
                            System.out.println("Escribe tu contrasena");
                            A5.contrasena = bufRead.readLine();

                            System.out.println("Desea otro ticket. Escriba 1 para comprar otro.");
                            String enterType1 = bufRead.readLine();
                            int continueReserveTicket = Integer.parseInt(enterType1);

                            if(continueReserveTicket == 1) {
                                System.out.println("Seleccione el segundo ticket que desea");
                            }
                            else {
                                System.out.println("Gracias por su compra");
                                full++;
                            }
                        }

                        else {
                            System.out.println("Este asiento ya fue tomado");
                        }
                    }

                    else {
                        System.out.println("Este numero no es valido");
                    }



                    //B1-B5
                    if(input.equals("B1")) {
                        if(B1.firstName == null) {
                            System.out.println("Escriba el nombre, apellido, correo y contrasena");
                            System.out.println("Primer Nombre: ");
                            B1.firstName = bufRead.readLine();
                            System.out.println("Primer apellido");
                            B1.lastName = bufRead.readLine();
                            System.out.println("Escribe tu correo");
                            B1.correo = bufRead.readLine();
                            System.out.println("Escribe tu contrasena");
                            B1.contrasena = bufRead.readLine();

                            System.out.println("Desea otro ticket. Escriba 1 para comprar otro.");
                            String enterType1 = bufRead.readLine();
                            int continueReserveTicket = Integer.parseInt(enterType1);

                            if(continueReserveTicket == 1) {
                                System.out.println("Seleccione el segundo ticket que desea");
                            }
                            else {
                                System.out.println("Gracias por su compra");
                                full++;
                            }
                        }

                        else {
                            System.out.println("Este asiento ya fue tomado");
                        }
                    }

                    else if(input.equals("B2")) {
                        if(B2.firstname == null) {
                            System.out.println("Escriba el nombre, apellido, correo y contrasena");
                            System.out.println("Primer Nombre: ");
                            B2.firstName = bufRead.readLine();
                            System.out.println("Primer apellido");
                            B2.lastName = bufRead.readLine();
                            System.out.println("Escribe tu correo");
                            B2.correo = bufRead.readLine();
                            System.out.println("Escribe tu contrasena");
                            B2.contrasena = bufRead.readLine();

                            System.out.println("Desea otro ticket. Escriba 1 para comprar otro.");
                            String enterType1 = bufRead.readLine();
                            int continueReserveTicket = Integer.parseInt(enterType1);

                            if(continueReserveTicket == 1) {
                                System.out.println("Seleccione el segundo ticket que desea");
                            }
                            else {
                                System.out.println("Gracias por su compra");
                                full++;
                            }
                        }

                        else {
                            System.out.println("Este asiento ya fue tomado");
                        }
                    }

                    else if(input.equals("B3")) {
                        if(B3.firstname == null) {
                            System.out.println("Escriba el nombre, apellido, correo y contrasena");
                            System.out.println("Primer Nombre: ");
                            B3.firstName = bufRead.readLine();
                            System.out.println("Primer apellido");
                            B3.lastName = bufRead.readLine();
                            System.out.println("Escribe tu correo");
                            B3.correo = bufRead.readLine();
                            System.out.println("Escribe tu contrasena");
                            B3.contrasena = bufRead.readLine();

                            System.out.println("Desea otro ticket. Escriba 1 para comprar otro.");
                            String enterType1 = bufRead.readLine();
                            int continueReserveTicket = Integer.parseInt(enterType1);

                            if(continueReserveTicket == 1) {
                                System.out.println("Seleccione el segundo ticket que desea");
                            }
                            else {
                                System.out.println("Gracias por su compra");
                                full++;
                            }
                        }

                        else {
                            System.out.println("Este asiento ya fue tomado");
                        }
                    }

                    else if(input.equals("B4")) {
                        if(B4.firstname == null) {
                            System.out.println("Escriba el nombre, apellido, correo y contrasena");
                            System.out.println("Primer Nombre: ");
                            B4.firstName = bufRead.readLine();
                            System.out.println("Primer apellido");
                            B4.lastName = bufRead.readLine();
                            System.out.println("Escribe tu correo");
                            B4.correo = bufRead.readLine();
                            System.out.println("Escribe tu contrasena");
                            B4.contrasena = bufRead.readLine();

                            System.out.println("Desea otro ticket. Escriba 1 para comprar otro.");
                            String enterType1 = bufRead.readLine();
                            int continueReserveTicket = Integer.parseInt(enterType1);

                            if(continueReserveTicket == 1) {
                                System.out.println("Seleccione el segundo ticket que desea");
                            }
                            else {
                                System.out.println("Gracias por su compra");
                                full++;
                            }
                        }

                        else {
                            System.out.println("Este asiento ya fue tomado");
                        }
                    }

                    else if(input.equals("B5")) {
                        if(B5.firstname == null) {
                            System.out.println("Escriba el nombre, apellido, correo y contrasena");
                            System.out.println("Primer Nombre: ");
                            B5.firstName = bufRead.readLine();
                            System.out.println("Primer apellido");
                            B5.lastName = bufRead.readLine();
                            System.out.println("Escribe tu correo");
                            B5.correo = bufRead.readLine();
                            System.out.println("Escribe tu contrasena");
                            B5.contrasena = bufRead.readLine();

                            System.out.println("Desea otro ticket. Escriba 1 para comprar otro.");
                            String enterType1 = bufRead.readLine();
                            int continueReserveTicket = Integer.parseInt(enterType1);

                            if(continueReserveTicket == 1) {
                                System.out.println("Seleccione el segundo ticket que desea");
                            }
                            else {
                                System.out.println("Gracias por su compra");
                                full++;
                            }
                        }

                        else {
                            System.out.println("Este asiento ya fue tomado");
                        }
                    }

                    else {
                        System.out.println("Este numero no es valido");
                    }



                    //C1-C5
                    if(input.equals("C1")) {
                        if(C1.firstName == null) {
                            System.out.println("Escriba el nombre, apellido, correo y contrasena");
                            System.out.println("Primer Nombre: ");
                            C1.firstName = bufRead.readLine();
                            System.out.println("Primer apellido");
                            C1.lastName = bufRead.readLine();
                            System.out.println("Escribe tu correo");
                            C1.correo = bufRead.readLine();
                            System.out.println("Escribe tu contrasena");
                            C1.contrasena = bufRead.readLine();

                            System.out.println("Desea otro ticket. Escriba 1 para comprar otro.");
                            String enterType1 = bufRead.readLine();
                            int continueReserveTicket = Integer.parseInt(enterType1);

                            if(continueReserveTicket == 1) {
                                System.out.println("Seleccione el segundo ticket que desea");
                            }
                            else {
                                System.out.println("Gracias por su compra");
                                full++;
                            }
                        }

                        else {
                            System.out.println("Este asiento ya fue tomado");
                        }
                    }

                    else if(input.equals("C2")) {
                        if(C2.firstname == null) {
                            System.out.println("Escriba el nombre, apellido, correo y contrasena");
                            System.out.println("Primer Nombre: ");
                            C2.firstName = bufRead.readLine();
                            System.out.println("Primer apellido");
                            C2.lastName = bufRead.readLine();
                            System.out.println("Escribe tu correo");
                            C2.correo = bufRead.readLine();
                            System.out.println("Escribe tu contrasena");
                            C2.contrasena = bufRead.readLine();

                            System.out.println("Desea otro ticket. Escriba 1 para comprar otro.");
                            String enterType1 = bufRead.readLine();
                            int continueReserveTicket = Integer.parseInt(enterType1);

                            if(continueReserveTicket == 1) {
                                System.out.println("Seleccione el segundo ticket que desea");
                            }
                            else {
                                System.out.println("Gracias por su compra");
                                full++;
                            }
                        }

                        else {
                            System.out.println("Este asiento ya fue tomado");
                        }
                    }

                    else if(input.equals("C3")) {
                        if(C3.firstname == null) {
                            System.out.println("Escriba el nombre, apellido, correo y contrasena");
                            System.out.println("Primer Nombre: ");
                            C3.firstName = bufRead.readLine();
                            System.out.println("Primer apellido");
                            C3.lastName = bufRead.readLine();
                            System.out.println("Escribe tu correo");
                            C3.correo = bufRead.readLine();
                            System.out.println("Escribe tu contrasena");
                            C3.contrasena = bufRead.readLine();

                            System.out.println("Desea otro ticket. Escriba 1 para comprar otro.");
                            String enterType1 = bufRead.readLine();
                            int continueReserveTicket = Integer.parseInt(enterType1);

                            if(continueReserveTicket == 1) {
                                System.out.println("Seleccione el segundo ticket que desea");
                            }
                            else {
                                System.out.println("Gracias por su compra");
                                full++;
                            }
                        }

                        else {
                            System.out.println("Este asiento ya fue tomado");
                        }
                    }

                    else if(input.equals("C4")) {
                        if(C4.firstname == null) {
                            System.out.println("Escriba el nombre, apellido, correo y contrasena");
                            System.out.println("Primer Nombre: ");
                            C4.firstName = bufRead.readLine();
                            System.out.println("Primer apellido");
                            C4.lastName = bufRead.readLine();
                            System.out.println("Escribe tu correo");
                            C4.correo = bufRead.readLine();
                            System.out.println("Escribe tu contrasena");
                            C4.contrasena = bufRead.readLine();

                            System.out.println("Desea otro ticket. Escriba 1 para comprar otro.");
                            String enterType1 = bufRead.readLine();
                            int continueReserveTicket = Integer.parseInt(enterType1);

                            if(continueReserveTicket == 1) {
                                System.out.println("Seleccione el segundo ticket que desea");
                            }
                            else {
                                System.out.println("Gracias por su compra");
                                full++;
                            }
                        }

                        else {
                            System.out.println("Este asiento ya fue tomado");
                        }
                    }

                    else if(input.equals("C5")) {
                        if(C5.firstname == null) {
                            System.out.println("Escriba el nombre, apellido, correo y contrasena");
                            System.out.println("Primer Nombre: ");
                            C5.firstName = bufRead.readLine();
                            System.out.println("Primer apellido");
                            C5.lastName = bufRead.readLine();
                            System.out.println("Escribe tu correo");
                            C5.correo = bufRead.readLine();
                            System.out.println("Escribe tu contrasena");
                            C5.contrasena = bufRead.readLine();

                            System.out.println("Desea otro ticket. Escriba 1 para comprar otro.");
                            String enterType1 = bufRead.readLine();
                            int continueReserveTicket = Integer.parseInt(enterType1);

                            if(continueReserveTicket == 1) {
                                System.out.println("Seleccione el segundo ticket que desea");
                            }
                            else {
                                System.out.println("Gracias por su compra");
                                full++;
                            }
                        }

                        else {
                            System.out.println("Este asiento ya fue tomado");
                        }
                    }

                    else {
                        System.out.println("Este numero no es valido");
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }







    private static void Cancel(asiento A1, asiento A2, asiento A3, asiento A4, asiento A5,
                               asiento B1, asiento B2, asiento B3, asiento B4, asiento B5,
                               asiento C1, asiento C2, asiento C3, asiento C4, asiento C5,
                               asiento D1, asiento D2, asiento D3, asiento D4, asiento D5,
                               asiento E1, asiento E2, asiento E3, asiento E4, asiento E5,
                               asiento F1, asiento F2, asiento F3, asiento F4, asiento F5,
                               asiento G1, asiento G2, asiento G3, asiento G4, asiento G5,
                               asiento H1, asiento H2, asiento H3, asiento H4, asiento H5) {
    }






    private static void printSeating(asiento A1, asiento A2, asiento A3, asiento A4, asiento A5,
                                     asiento B1, asiento B2, asiento B3, asiento B4, asiento B5,
                                     asiento C1, asiento C2, asiento C3, asiento C4, asiento C5,
                                     asiento D1, asiento D2, asiento D3, asiento D4, asiento D5,
                                     asiento E1, asiento E2, asiento E3, asiento E4, asiento E5,
                                     asiento F1, asiento F2, asiento F3, asiento F4, asiento F5,
                                     asiento G1, asiento G2, asiento G3, asiento G4, asiento G5,
                                     asiento H1, asiento H2, asiento H3, asiento H4, asiento H5) {
    }














}

