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
float calculate_exchange_rate(int euros, int dollars);

int main(void)
{
    CyGlobalIntEnable; /* Enable global interrupts. */

    /* Place your initialization/startup code here (e.g. MyInst_Start()) */
    UART_1_Start();
    
    int euros;
    int dollars;
    float exchange_rate;
    float amount;
    
    printf("Enter amount of euros: ");
    scanf("%d", &euros);
    printf("Enter amount of dollars: ");
    scanf("%d", &dollars);
    exchange_rate = calculate_exchange_rate(euros, dollars);
    printf("Exchange rate: %.4f\n", exchange_rate);
    printf("How many euros do want to exchange: ");
    scanf("%d", &euros);
    amount = euros * exchange_rate;
    printf("You'll get %.2f dollars.\n", amount);
    
    for(;;)
    {
        /* Place your application code here. */
    }
}

float calculate_exchange_rate(int euros, int dollars) {
    float exchange_rate;
    exchange_rate = (float) dollars / (float) euros;
    return exchange_rate;
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
