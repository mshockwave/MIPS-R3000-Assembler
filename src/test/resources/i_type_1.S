          lhu  $2, 0($0)        # $2 = x
          bne  $2, $0, x_not_0
          ori  $5, $0, 0x88     # $5 = 0x88
          lbu  $3, 2($0)        # $3 = y
          slt  $6, $5, $3       # $6 = !( y <= 0x88 ) = ( 0x88 < y )
          bne  $6, $0, x_0_else
          lb   $4, 3($0)        # $4 = z
          slti $6, $4, -0x80    # $6 = ( z < -0x80 )
          bne  $6, $0, x_0_else
          addi $7, $0, 1
          addi $7, $0, 1
x_0_else: addi $7, $0, -1
          addi $7, $0, -1
 x_not_0: ori  $5, $0, 0x88     # $5 = 0x88