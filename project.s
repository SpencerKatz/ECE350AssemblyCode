nop
nop
nop
nop
nop
start:
addi $sp, $sp -24
sw $ra, 0($sp)
sw $s0, 4($sp)
sw $s1, 8($sp)
sw $s2, 12($sp)
sw $s3, 16($sp)
sw $s4, 20($sp)

nop
force $s1
gyro $s0
# addi $s0, $zero, 134
nop
nop
bne $zero, $s1, break
add $a0, $s0, $zero
jal branches
j after_break
break:
add $s2, $zero, $zero
add $s3, $zero, $zero
j after_after_break
after_break:
add $s2, $v0, $zero
add $s3, $v1, $zero

addi $s4, $zero, -5
bne $s2, $s4, update
j dontUpdateMotor
update:
after_after_break:
nop
nop
nop
nop
nop
nop
ctrlOne $zero, $s2, $zero
ctrlTwo $zero, $s3, $zero
dontUpdateMotor:
nop
nop
j start
add $v0, $zero, $zero
lw $ra, 0($sp)
lw $s0, 4($sp)
lw $s1, 8($sp)
lw $s2, 12($sp)
lw $s3, 16($sp)
lw $s4, 20($sp)
addi $sp, $sp, 24
jr $ra

branches:
    addi $sp, $sp, -8
    sw $s0, 0($sp)
    sw $ra, 4($sp)
    add $s0, $a0, $zero

    addi $v0, $zero, -5
    addi $v1, $zero, -5

    # Check for the value 224
    addi $t0, $zero, 224
    bne $s0, $t0, check225
    addi $v0, $zero, 85
    addi $v1, $zero, 85
    j continue_execution

check225:
    addi $t0, $zero, 225
    bne $s0, $t0, check257
    addi $v0, $zero, 86
    addi $v1, $zero, 84
    j continue_execution

check257:
    addi $t0, $zero, 257
    bne $s0, $t0, check193
    addi $v0, $zero, 87
    addi $v1, $zero, 83
    j continue_execution

check193:
    addi $t0, $zero, 193
    bne $s0, $t0, check194
    addi $v0, $zero, 88
    addi $v1, $zero, 82
    j continue_execution

check194:
    addi $t0, $zero, 194
    bne $s0, $t0, check195
    addi $v0, $zero, 89
    addi $v1, $zero, 81
    j continue_execution

check195:
    addi $t0, $zero, 195
    bne $s0, $t0, check196
    addi $v0, $zero, 90
    addi $v1, $zero, 80
    j continue_execution

check196:
    addi $t0, $zero, 196
    bne $s0, $t0, check164
    addi $v0, $zero, 91
    addi $v1, $zero, 79
    j continue_execution

check164:
    addi $t0, $zero, 164
    bne $s0, $t0, check165
    addi $v0, $zero, 92
    addi $v1, $zero, 78
    j continue_execution

check165:
    addi $t0, $zero, 165
    bne $s0, $t0, check133
    addi $v0, $zero, 93
    addi $v1, $zero, 77
    j continue_execution

check133:
    addi $t0, $zero, 133
    bne $s0, $t0, check134
    addi $v0, $zero, 94
    addi $v1, $zero, 76
    j continue_execution

check134:
    addi $t0, $zero, 134
    bne $s0, $t0, check102
    addi $v0, $zero, 95
    addi $v1, $zero, 75
    j continue_execution

check102:
    addi $t0, $zero, 102
    bne $s0, $t0, check103
    addi $v0, $zero, 96
    addi $v1, $zero, 74
    j continue_execution

check103:
    addi $t0, $zero, 103
    bne $s0, $t0, check239
    addi $v0, $zero, 97
    addi $v1, $zero, 73
    j continue_execution


check239:
    addi $t0, $zero, 239
    bne $s0, $t0, check238
    addi $v0, $zero, 85
    addi $v1, $zero, 85
    j continue_execution

check238:
    addi $t0, $zero, 238
    bne $s0, $t0, check237
    addi $v0, $zero, 84
    addi $v1, $zero, 86
    j continue_execution

check237:
    addi $t0, $zero, 237
    bne $s0, $t0, check268
    addi $v0, $zero, 83
    addi $v1, $zero, 87
    j continue_execution

check268:
    addi $t0, $zero, 268
    bne $s0, $t0, check236
    addi $v0, $zero, 82
    addi $v1, $zero, 88
    j continue_execution

check236:
    addi $t0, $zero, 236
    bne $s0, $t0, check204
    addi $v0, $zero, 81
    addi $v1, $zero, 89
    j continue_execution

check204:
    addi $t0, $zero, 204
    bne $s0, $t0, check203
    addi $v0, $zero, 80
    addi $v1, $zero, 90
    j continue_execution

check203:
    addi $t0, $zero, 203
    bne $s0, $t0, check202
    addi $v0, $zero, 79
    addi $v1, $zero, 91
    j continue_execution

check202:
    addi $t0, $zero, 202
    bne $s0, $t0, check170
    addi $v0, $zero, 78
    addi $v1, $zero, 92
    j continue_execution

check170:
    addi $t0, $zero, 170
    bne $s0, $t0, check169
    addi $v0, $zero, 77
    addi $v1, $zero, 93
    j continue_execution

check169:
    addi $t0, $zero, 169
    bne $s0, $t0, check137
    addi $v0, $zero, 76
    addi $v1, $zero, 94
    j continue_execution

check137:
    addi $t0, $zero, 137
    bne $s0, $t0, check136
    addi $v0, $zero, 75
    addi $v1, $zero, 95
    j continue_execution

check136:
    addi $t0, $zero, 136
    bne $s0, $t0, check104
    addi $v0, $zero, 74
    addi $v1, $zero, 96
    j continue_execution

check104:
    addi $t0, $zero, 104
    bne $s0, $t0, check72
    addi $v0, $zero, 73
    addi $v1, $zero, 97
    j continue_execution

check72:
    addi $t0, $zero, 72
    bne $s0, $t0, continue_execution
    addi $v0, $zero, 72
    addi $v1, $zero, 98
    j continue_execution


continue_execution:
    lw $s0, 0($sp)
    lw $ra, 4($sp)
    addi $sp, $sp, 8
    jr $ra 




# Register 16 gyroscope (opCode 01011)
# Register 17 forceSensor opCode(11101)
# Register 18 FirstController r Type opCode(01001)
# Register 19 SecondController r Type opCode(01010)