package com.jjcbs.blog.home.dao.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/6/19 0019.
 */
@Entity
@Table(name = "shopnc_goods_attr_index", schema = "shopnc", catalog = "")
@IdClass(ShopncGoodsAttrIndexPK.class)
public class ShopncGoodsAttrIndex {
    private int goodsId;
    private int goodsCommonid;
    private int gcId;
    private int typeId;
    private int attrId;
    private int attrValueId;

    @Id
    @Column(name = "goods_id")
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_commonid")
    public int getGoodsCommonid() {
        return goodsCommonid;
    }

    public void setGoodsCommonid(int goodsCommonid) {
        this.goodsCommonid = goodsCommonid;
    }

    @Id
    @Column(name = "gc_id")
    public int getGcId() {
        return gcId;
    }

    public void setGcId(int gcId) {
        this.gcId = gcId;
    }

    @Basic
    @Column(name = "type_id")
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "attr_id")
    public int getAttrId() {
        return attrId;
    }

    public void setAttrId(int attrId) {
        this.attrId = attrId;
    }

    @Id
    @Column(name = "attr_value_id")
    public int getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(int attrValueId) {
        this.attrValueId = attrValueId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopncGoodsAttrIndex that = (ShopncGoodsAttrIndex) o;

        if (goodsId != that.goodsId) return false;
        if (goodsCommonid != that.goodsCommonid) return false;
        if (gcId != that.gcId) return false;
        if (typeId != that.typeId) return false;
        if (attrId != that.attrId) return false;
        if (attrValueId != that.attrValueId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = goodsId;
        result = 31 * result + goodsCommonid;
        result = 31 * result + gcId;
        result = 31 * result + typeId;
        result = 31 * result + attrId;
        result = 31 * result + attrValueId;
        return result;
    }
}
