/* ========================================
 *
 * Copyright YOUR COMPANY, THE YEAR
 * All Rights Reserved
 * UNPUBLISHED, LICENSED SOFTWARE.
 *
 * CONFIDENTIAL AND PROPRIETARY INFORMATION
 * WHICH IS THE PROPERTY OF your company.
 *
 * ========================================
*/
#include <project.h>
#include <stdio.h>
#include <string.h>

struct months {
    char *name;
    int number;
};

void enter_month(struct months month);

int main(void)
{
    CyGlobalIntEnable; /* Enable global interrupts. */

    /* Place your initialization/startup code here (e.g. MyInst_Start()) */
    UART_1_Start();
    
    int month_number;
    char month_name[10];
    do {
        printf("Enter information about first month of year: \n");
        printf("Enter month number: ");
        scanf("%d", &month_number);
        if (month_number < 1 || month_number > 12) {
            printf("Month number must be in range 1-12!\n");
        }
    } while (month_number < 1 || month_number > 12);
    printf("Enter name of month number %d: ", month_number);
    scanf("%s", month_name);
    
    int month_number2;
    char month_name2[10];
    do {
        printf("Enter information about last month of year: \n");
        printf("Enter month number: ");
        scanf("%d", &month_number2);
        if (month_number2 < 1 || month_number2 > 12) {
            printf("Month number must be in range 1-12!\n");
        }
    } while (month_number2 < 1 || month_number2 > 12);
    printf("Enter name of month number %d: ", month_number2);
    scanf("%s", month_name2);
    
    struct months m1 = {month_name, month_number};
    struct months m2 = {month_name2, month_number2};
    
    printf("You entered the following months:\n");
    enter_month(m1);
    enter_month(m2);
    
    for(;;)
    {
        /* Place your application code here. */
    }
}

void enter_month(struct months month) {
    printf("%d. %s\n", month.number, month.name);
}

int _write(int file, char *ptr, int len)
{
    (void)file; /* Parameter is not used, suppress unused argument warning */
	int n;
	for(n = 0; n < len; n++) {
        if(*ptr == '\n') UART_1_PutChar('\r');
		UART_1_PutChar(*ptr++);
	}
	return len;
}

int _read (int file, char *ptr, int count)
{
    int chs = 0;
    char ch;
 
    (void)file; /* Parameter is not used, suppress unused argument warning */
    while(count > 0) {
        ch = UART_1_GetChar();
        if(ch != 0) {
            UART_1_PutChar(ch);
            chs++;
            if(ch == '\r') {
                ch = '\n';
                UART_1_PutChar(ch);
            }
            *ptr++ = ch;
            count--;
            if(ch == '\n') break;
        }
    }
    return chs;
}
/* [] END OF FILE */
