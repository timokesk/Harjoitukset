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

int get_numbers(int lower, int upper);

int main(void)
{
    CyGlobalIntEnable; /* Enable global interrupts. */

    /* Place your initialization/startup code here (e.g. MyInst_Start()) */
    UART_1_Start();
    
    int num1 = get_numbers(10, 20);
    int num2 = get_numbers(0, 5);
    
    printf("%d multiplied by %d is %d.\n", num1, num2, num1 * num2);
    
    for(;;)
    {
        /* Place your application code here. */
    }
}

int get_numbers(int lower, int upper) {
    int input;
    do {
        printf("Enter a number [%d - %d]: ", lower, upper);
        scanf("%d", &input);
        if (input < lower || input > upper) {
            printf("Invalid value! Number must be between %d and %d.\n", lower, upper);
        }
    } while (input < lower || input > upper);
    return input;
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
