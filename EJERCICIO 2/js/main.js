
function getDayNumber(janFirstDayNumber, yearDayNumber){
    return (janFirstDayNumber+(yearDayNumber-1))%7;
} //getDayNumber



console.log(getDayNumber(6,36));
// En el dia del año: 10   256 (martes-2023)
// Como editar el año? como integrarlo?
