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

int main(void)
{
    CyGlobalIntEnable; /* Enable global interrupts. */

    /* Place your initialization/startup code here (e.g. MyInst_Start()) */
    UART_1_Start();
    
    float salary = 1238.75;
    float tax_percentage = 17.0;
    float tax;
    float net_income;
    float raise = 150;
    
    printf("My salary is %.2f euros.\n", salary);
    printf("My tax percentage is %.1f percent.\n", tax_percentage);
    
    tax = 0.01 * tax_percentage * salary;
    
    printf("I have to pay %.2f euros tax.\n", tax);
    
    net_income = salary - tax;
    
    printf("I have %.2f euros to spend or save.\n", net_income);
    printf("My boss raises my salary by %.0f euros.\n", raise);
    
    salary = salary + raise;
    
    printf("My new salary is %.2f euros.\n", salary);
    
    tax = 0.01 * tax_percentage * salary;
    net_income = salary - tax;
    
    printf("After taxes I have %.2f euros.\n", net_income);
    
    for(;;)
    {
        /* Place your application code here. */
    }
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
