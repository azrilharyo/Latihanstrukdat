public class Kota<E> {
    private E elemennt;

    public Kota(E kota){
       elemennt = kota;
    }
    public E getElemennt(){
        return elemennt;
    }

    public static void main(String[] args){
        Kota<Integer> jumlahkota = new Kota<Integer>(9);
        Kota<String> namakota = new Kota<String>("Malang");
        System.out.println("Jumlah Kota di Jawa Timur : "+ jumlahkota.getElemennt()+ "kota");
        System.out.println("Salah Satu Kota di Jawa Timur : Kota "+ namakota.getElemennt());
    }
}
