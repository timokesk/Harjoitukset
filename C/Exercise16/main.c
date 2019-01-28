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

float get_average(float *num1, float *num2);

int main(void)
{
    CyGlobalIntEnable; /* Enable global interrupts. */

    /* Place your initialization/startup code here (e.g. MyInst_Start()) */
    UART_1_Start();
    
    float num1;
    float num2;
    float average;
    
    printf("Enter 1. number: ");
    scanf("%f", &num1);
    printf("Enter 2. number: ");
    scanf("%f", &num2);
    
    average = get_average(&num1, &num2);
    
    printf("Average value is: %.3f\n", average);
    printf("1. deviation: %.3f\n", num1);
    printf("2. deviation: %.3f\n", num2);
    
    for(;;)
    {
        /* Place your application code here. */
    }
}

float get_average(float *num1, float *num2) {
    float average;
    average = (*num1 + *num2) / 2;
    *num1 = *num1 - average;
    *num2 = *num2 - average;
    return average;
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
