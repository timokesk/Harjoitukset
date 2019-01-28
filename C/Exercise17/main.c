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

void convert_values(float exchange_rate, float *floatPtr, int array_size);

int main(void)
{
    CyGlobalIntEnable; /* Enable global interrupts. */

    /* Place your initialization/startup code here (e.g. MyInst_Start()) */
    UART_1_Start();
    
    int array_size = 5;
    float array[array_size];
    float *floatPtr = array;
    float exchange_rate;
    
    printf("Enter exchange rate: ");
    scanf("%f", &exchange_rate);
    
    int i;
    for (i = 1; i <= array_size; i++) {
        printf("Enter %d. amount: ", i);
        float amount;
        scanf("%f", &amount);
        *floatPtr = amount;
        floatPtr++;
    }
    
    floatPtr = array;
    
    convert_values(exchange_rate, floatPtr, array_size);
    
    floatPtr = array;
    
    printf("Converted amounts are: \n");
    
    for (i = 1; i <= array_size; i++) {
        printf("%d: %8.2f\n", i, *floatPtr);
        floatPtr++;
    }
    
    for(;;)
    {
        /* Place your application code here. */
    }
}

void convert_values(float exchange_rate, float *floatPtr, int array_size) {
    int i;
    for (i = 0; i < array_size; i++) {
        *floatPtr = *floatPtr * exchange_rate;
        floatPtr++;
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
