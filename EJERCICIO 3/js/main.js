
function businessHours(dayNumber, hourNumber){
    if((dayNumber>=1) && (dayNumber<=5) &&
       (hourNumber>=9) && (hourNumber<=18)
    )  {
        return true;
    } else {
        return false;
    } //if
}// BusisinessHours



function getDayNumber(janFirstDayNumber, yearDayNumber){
    return (janFirstDayNumber+(yearDayNumber-1))%7;
} //getDayNumber



function part3(yearDayNumber, hourNumber){
    let day = getDayNumber(0,hourNumber);



}//part3
console.log 
part3(28,17)
