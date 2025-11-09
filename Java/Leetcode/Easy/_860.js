/**
 * @param {number[]} bills
 * @return {boolean}
 */
var lemonadeChange = function(bills) {
    let bank = {
        five: 0,
        ten: 0,
        twenty: 0
    }
    if(bills[0]!=5){return false}
    else
    {
        bank.five++;
        for( x=1; x< bills.length; x++){
             if(bills[x]== 5){bank.five++;}
             if(bills[x] == 10){
                 bank.ten++;
                 if(bank.five === 0){return false}else{bank.five--;}
             }
            if(bills[x] == 20){
                bank.twenty++;
                if(bank.ten > 0 && bank.five >0){
                    bank.ten--;
                    bank.five--;
                }else if(bank.five >= 3){
                    bank.five -= 3;
                }
                else{
                    return false;
                }
            }
        }return true;
    }
}