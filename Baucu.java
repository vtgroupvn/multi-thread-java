/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baucu;
import baucu.person;
import baucu.Bophieu;
/**
 *
 * @author admin
 */
public class Baucu {
    private person[] danhsachnguoibau;
    private int tongphieu;
    private int trungcu;
    private int songuoidabophieu;
    /**
     * @param args the command line arguments
     */
    public void dabophieu()
    {
        this.songuoidabophieu++;
    }
    public void taodanhsachnguoibaucu()
    {
        // TODO code application logic here
        this.danhsachnguoibau = new person[this.tongphieu];
        Homphieu PD = new Homphieu();
        Bophieu[] Phieu;
        Phieu = new Bophieu[this.tongphieu];
        for(int i = 0; i < this.tongphieu; i++){
            this.danhsachnguoibau[i] = new person();
            this.danhsachnguoibau[i].ghitennguoibau(Integer.toString(i+1));
            this.danhsachnguoibau[i].ghiphieubau();
            System.out.println("Person: "+this.danhsachnguoibau[i].getName()+", phiếu chọn: "+Integer.toString(this.danhsachnguoibau[i].phieubau));
            Phieu[i] = new Bophieu( "Phiếu - " + Integer.toString(i), PD );
            Phieu[i].start(this.danhsachnguoibau[i], this);
        }
    }
    public void kiemphieu()
    {
        if (this.songuoidabophieu == this.tongphieu)
        {
            if (this.songuoidabophieu <= this.tongphieu && Homphieu.tongdiem >= this.trungcu){
                System.out.println("Tổng phiếu: " + Integer.toString(this.songuoidabophieu) + ", Tổng điểm: "+Integer.toString(Homphieu.tongdiem)+ " => Trúng cữ(kết thúc bầu cữ)");
            }else{
                this.danhsachnguoibau = new person[this.tongphieu];
                System.out.println("Tổng phiếu: "+Integer.toString(this.songuoidabophieu) + ", Tổng điểm: "+Integer.toString(Homphieu.tongdiem)+ " < 3 => Bầu lại từ đầu.");
                Homphieu.tongdiem = 0;
                this.songuoidabophieu = 0;
                this.taodanhsachnguoibaucu();
            }
        }
    }
    public static void main(String[] args) {
        Baucu baucu = new Baucu();
        baucu.tongphieu = 5;
        baucu.trungcu = 3;
        baucu.taodanhsachnguoibaucu();
    }
}
